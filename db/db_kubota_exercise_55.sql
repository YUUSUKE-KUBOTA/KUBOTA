/* �ǉ����K55 */
SELECT
    countries.group_name,
    COUNT(DISTINCT goals.id) AS group_goals
FROM
    pairings
    LEFT OUTER JOIN countries ON pairings.my_country_id = countries.id
    LEFT OUTER JOIN goals ON goals.pairing_id = pairings.id
WHERE
    pairings.kickoff BETWEEN '2014-06-13 00:00:00' AND '2014-06-27 23:59:59'
GROUP BY
    countries.group_name;