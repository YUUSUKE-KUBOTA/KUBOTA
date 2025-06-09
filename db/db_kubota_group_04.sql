/* 課題⑧ */
/* Q.04 */
SELECT
    COUNT(男性),
	COUNT(女性)
FROM
    社員マスタ
WHERE
    0 = 0
GROUP BY
    性別;