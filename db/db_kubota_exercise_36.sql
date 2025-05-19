/* ’Ç‰Á‰‰K36 */
SELECT
    MAX(ranking) AS top_team,
    MIN(ranking) AS under_team,
    MAX(ranking) - MIN(ranking) AS ranking_difference
FROM
    countries
WHERE
    0 = 0
GROUP BY
    group_name
HAVING
    MAX(ranking) - MIN(ranking) > 50;