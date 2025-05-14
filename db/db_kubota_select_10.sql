/* ‰Û‘è‡A */
/* Q.10 */
SELECT
    shop_id,
    shop_name,
    ins_date,
    ins_user_id,
    upd_counter,
    upd_date,
    upd_user_id
FROM
    nmrm_shop
WHERE
    shop_name LIKE '%”L%';