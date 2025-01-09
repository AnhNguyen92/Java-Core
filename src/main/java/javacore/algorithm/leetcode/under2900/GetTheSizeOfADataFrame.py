/*
 * 2878. Get the Size of a DataFrame
 */

import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    rows, columns = players.shape
    return [rows, columns]