/* í«â¡ââèK55 */
SELECT
    countries.group_name,
    COUNT(DISTINCT goals.goal_time) AS group_goals
FROM
    countries
    INNER JOIN pairings ON countries.id = pairings.my_country_id
    INNER JOIN players ON players.country_id = countries.id
    RIGHT OUTER JOIN goals ON goals.player_id = players.id
WHERE
    pairings.kickoff BETWEEN '2014-06-13' AND '2014-06-27'
GROUP BY
    countries.group_name;