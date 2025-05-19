/* ’Ç‰Á‰‰K46 */
SELECT
    AVG(height) AS gk_ave_height,
    AVG(weight) AS gk_ave_weight
FROM
    players
WHERE
    position = 'GK';