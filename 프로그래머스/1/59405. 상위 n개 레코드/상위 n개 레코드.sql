-- 코드를 입력하세요
SELECT name
FROM animal_ins
WHERE datetime <= ALL (SELECT datetime FROM animal_ins);