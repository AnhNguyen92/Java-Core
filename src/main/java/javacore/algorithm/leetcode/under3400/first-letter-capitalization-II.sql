/**
 * 3374. First Letter Capitalization II
 */

 /* Write your PL/SQL query statement below */

 select content_id, content_text original_text, INITCAP(content_text) converted_text
 from user_content;

