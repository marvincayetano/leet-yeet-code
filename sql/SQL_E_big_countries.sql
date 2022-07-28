-- There is a table World

-- +-----------------+------------+------------+--------------+---------------+
-- | name            | continent  | area       | population   | gdp           |
-- +-----------------+------------+------------+--------------+---------------+
-- | Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |
-- | Albania         | Europe     | 28748      | 2831741      | 12960000      |
-- | Algeria         | Africa     | 2381741    | 37100000     | 188681000     |
-- | Andorra         | Europe     | 468        | 78115        | 3712000       |
-- | Angola          | Africa     | 1246700    | 20609294     | 100990000     |
-- +-----------------+------------+------------+--------------+---------------+
-- A country is big if it has an area of bigger than 3 million square km or a population of more than 25 million.

-- Write a SQL solution to output big countries' name, population and area.

-- For example, according to the above table, we should output:

-- +--------------+-------------+--------------+
-- | name         | population  | area         |
-- +--------------+-------------+--------------+
-- | Afghanistan  | 25500100    | 652230       |
-- | Algeria      | 37100000    | 2381741      |
-- +--------------+-------------+--------------+

SELECT name,population,area
FROM World
WHERE area > 3000000 or population > 25000000;

-- A lot faster than above
-- But why would it be faster ??
-- NOTE: Both UNION and UNION ALL operators combine rows from result sets into a single result set.
--       The UNION operator removes eliminate duplicate rows, whereas the UNION ALL operator does not.
--       Because the UNION ALL operator does not remove duplicate rows, it runs faster than the UNION operator.

-- NOTE: The reason is that using OR in a query will often cause the Query Optimizer to abandon use of index seeks
--       and revert to scans. If you look at the execution plans for your two queries, you'll most likely see scans
--       where you are using the OR and seeks where you are using the UNION

SELECT
    name, population, area
FROM
    world
WHERE
    area >= 3000000

UNION

SELECT
    name, population, area
FROM
    world
WHERE
    population >= 25000000
;