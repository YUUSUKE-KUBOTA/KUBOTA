/* ’Ç‰Á‰‰K45 */
SELECT
    ranking
FROM
    countries
WHERE
       ranking IN (SELECT MIN(ranking) FROM countries)
    OR ranking IN (SELECT MAX(ranking) FROM countries)