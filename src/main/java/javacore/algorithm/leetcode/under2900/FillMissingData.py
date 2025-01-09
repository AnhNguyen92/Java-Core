/*
 * 2887. Fill Missing Data
 */

 import pandas as pd

 def fillMissingValues(products: pd.DataFrame) -> pd.DataFrame:
     products['quantity'].df.dropna()
     return products