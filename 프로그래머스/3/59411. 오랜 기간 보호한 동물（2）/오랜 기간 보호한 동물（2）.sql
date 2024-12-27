-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM 
(SELECT (O.DATETIME-I.DATETIME) AS DATETIME, I.ANIMAL_ID AS ANIMAL_ID, I.NAME AS NAME
 FROM ANIMAL_INS I JOIN ANIMAL_OUTS O
 ON I.ANIMAL_ID = O.ANIMAL_ID
 ORDER BY DATETIME DESC)
WHERE ROWNUM < 3;

