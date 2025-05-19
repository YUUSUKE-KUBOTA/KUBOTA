/* í«â¡ââèK55 */
SELECT
    countries.group_name,
    (SELECT 
        COUNT(goals.id)
    FROM
        goals
        INNER JOIN players ON (goals.player_id = players.id)
        INNER JOIN pairings ON (countries.id = pairings.my_country_id)
    WHERE 
             players.country_id = countries.id
        AND  pairings.kickoff BETWEEN '2014-06-13' AND '2014-06-27'
    GROUP BY
        goals
     ) AS group_goals
FROM
    countries
WHERE
    0 = 0