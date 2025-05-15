/* 課題⑨ */
/* Q.02 */
SELECT
    社員コード,
    社員名,
    年齢,
    給料,
    性別
FROM
    社員マスタ
WHERE
    性別 = '男性'
ORDER BY
    年齢 ASC,
    給料 DESC;