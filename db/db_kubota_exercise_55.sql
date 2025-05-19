/* ’Ç‰Á‰‰K55o—ˆ‚Ä‚¢‚È‚¢ */
SELECT
    countries.group_name,
    COUNT(DISTINCT goals.goal_time) AS group_goals
FROM
    pairings
	LEFT OUTER JOIN countries ON pairings.my_country_id = countries.id
    LEFT OUTER JOIN players ON players.country_id = countries.id
	LEFT OUTER JOIN goals ON goals.player_id = players.id
WHERE
    pairings.kickoff BETWEEN '2014-06-13' AND '2014-06-27'
GROUP BY
    countries.group_name;