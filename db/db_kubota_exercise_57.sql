/* í«â¡ââèK57 */
SELECT
    CASE
	  
	END
FROM
	pairings
    LEFT OUTER JOIN countries AS my_country ON (pairings.my_country_id = my_country.id)
    LEFT OUTER JOIN countries AS enemy_country ON (pairings.enemy_country_id = enemy_country.id)
	LEFT OUTER JOIN goals ON (pairings.id = goals.pairing_id)
WHERE
        my_country.id = 39
    AND enemy_country.id = 103;