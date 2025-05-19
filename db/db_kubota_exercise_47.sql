/* í«â¡ââèK47 */
SELECT
    countries.name,
    n_countries.avg_height
FROM
    countries
    INNER JOIN (
        SELECT
            country_id,
            AVG(height) AS avg_height
        FROM
            players
        WHERE 
            0 = 0
        GROUP BY
            country_id) AS n_countries
        ON (n_countries.country_id = countries.id)
WHERE
    0 = 0
ORDER BY
    n_countries.avg_height DESC;