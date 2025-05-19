/* í«â¡ââèK48 */
SELECT
    (SELECT name FROM countries WHERE countries.id = players.country_id) AS country_name,
    AVG(height) AS avg_height
FROM
    players
WHERE
    0 = 0
GROUP BY
    players.country_id
ORDER BY
    avg_height DESC;