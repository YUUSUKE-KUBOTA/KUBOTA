/* �ǉ����K57 */
SELECT
    CASE
        WHEN japan_goals > colombia_goals THEN 'win:���{ lose:�R�����r�A'
        WHEN japan_goals < colombia_goals THEN 'win:�R�����r�A lose:���{'
        ELSE '��������'
    END AS result
FROM (
    SELECT
        (SELECT
           COUNT(goals.id)
         FROM 
           pairings
           INNER JOIN goals ON pairings.id = goals.pairing_id
           INNER JOIN players ON goals.player_id = players.id
         WHERE
           pairing_id = 39) AS japan_goals,
        (SELECT
           COUNT(goals.id)
         FROM
           pairings
           INNER JOIN goals ON pairings.id = goals.pairing_id
           INNER JOIN players ON goals.player_id = players.id
         WHERE
           pairing_id = 103) AS colombia_goals
) AS scores;