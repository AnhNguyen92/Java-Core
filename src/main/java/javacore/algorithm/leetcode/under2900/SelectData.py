/*
 * 2880. Select Data
 */

import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    res = students[students['student_id'] == 101]
    return res[['name', 'age']]