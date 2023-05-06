/*
 * LeetCode 1280. Students and Examinations
 */

# Write your MySQL query statement below

select st.student_id
    ,st.student_name
    ,s.subject_name
    ,count(e.student_id and e.subject_name) 'attended_exams'
from Students st  join Subjects s 
 left join Examinations e  
 on e.subject_name = s.subject_name
and e.student_id = st.student_id
 
group by st.student_id, st.student_name, s.subject_name
order by st.student_id asc, st.student_name asc;
