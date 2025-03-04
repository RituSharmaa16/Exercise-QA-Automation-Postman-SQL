SELECT DISTINCT d.*
FROM Doctors d
INNER JOIN Admissions a ON d.doctor_id = a.attending_doctor_id;

SELECT d.*
FROM Doctors d
LEFT JOIN Admissions a ON d.doctor_id = a.attending_doctor_id
WHERE a.attending_doctor_id IS NULL;

SELECT p.*
FROM Patients p
INNER JOIN Admissions a ON p.patient_id = a.patient_id
LEFT JOIN Doctors d ON a.attending_doctor_id = d.doctor_id
WHERE d.doctor_id IS NULL;
