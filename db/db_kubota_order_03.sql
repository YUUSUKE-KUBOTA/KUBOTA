/* 課題⑨ */
/* Q.03 */
SELECT
    年齢,
	COUNT(*)
FROM
    社員マスタ
WHERE
    性別 = '女性'
GROUP BY
    年齢
ORDER BY
    COUNT(*) DESC,
    年齢 ASC;