// do not edit !!
function rex_gfGetGauceCsvStr(oDataSet)
{
	var sData = "";
	var sColSep = "";
	var sDsSep = "";

	var oDs;

	for (k = 0; k < arguments.length; k++) {
		oDs = arguments[k];

		if (k > 0) sDsSep = rex_gsCsvSeparatorDataset;

		sData += sDsSep;
 //alert(oDs.OrgString(0,5));
		for (var i = 1; i <= oDs.CountRow; i++) {
			
			for (var j = 1; j <= oDs.CountColumn; j++) {
				//if (i == 1) alert(oDs.ColumnID(j));
//				if (i == 1) alert(oDs.OrgNameString(i,j));
				
				if (i > 1 || j > 1) sColSep = rex_gsCsvSeparatorColumn;
				sData += sColSep + oDs.OrgString(i, j);
			}
		}
		
		sColSep = "";
	}
	

	return sData;
}
