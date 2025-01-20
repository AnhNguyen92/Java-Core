/**
 * 3421. Find Students Who Improved
 */

 # Write your MySQL query statement below

 select  student_id
         , subject
         , (select score from Scores where student_id = s.student_id and subject = s.subject and exam_date = min(s.exam_date)) as first_score
         , (select score from Scores where student_id = s.student_id and subject = s.subject and exam_date = max(s.exam_date)) as latest_score
 from Scores s
 group by student_id, subject
 having first_score < latest_score
 order by student_id asc;
