<?xml version="1.0"?>
<Report Title="" Author="" Company="" Category="" Description="" CreatedDate="2007-09-11 17:38:50" LastSavedDate="2008-02-29 15:06:50" Version="2.5.1.97"><FieldInfo><FieldSet ID="1"><Field Name="corpName" Type="8" Size="0" Xpath="corpName"/><Field Name="noticeTitle" Type="8" Size="0" Xpath="noticeTitle"/><Field Name="receipDate" Type="8" Size="0" Xpath="receipDate"/><Field Name="seqNum" Type="8" Size="0" Xpath="seqNum"/><Field Name="submitName" Type="8" Size="0" Xpath="submitName"/></FieldSet><FieldSet ID="2"><Field Name="test_data" Type="1" Default="" Prompt="test_data"/></FieldSet><FieldSet ID="3"><Field Name="tel" ScriptType="1"><![CDATA[var test = "{@Field8}"+"-"+"{@Field9}"+"-"+"{@Field10}";

return test;]]></Field><Field Name="test" ScriptType="1"><![CDATA[var temp = "{@Field1}"+"{@Field2}"
+"{@Field3}"+"{@Field4}"
+"{@Field5}"+"{@Field6}"
+"{@Field7}"+"{@Field8}"
+"{@Field9}"+"{@Field10}";

return temp;]]></Field></FieldSet><FieldSet ID="4"/></FieldInfo><DataSetting EncryptSQL="1" ConnectionString="" DynamicSQL="0" SQLScriptType="1" RecordType="2" DataPath="C:\Documents and Settings\TEC016\바탕 화면\test.xml" DataRoot="rowdata/value/rowdata" XslPath="" XsdPath="" CsvPath="" CsvRowSeparator="|@|" CsvColumnSeparator="|*|"><OrderInfos/><FilterInfos/><SPInfo FunctionName=""/><SQL>jkCY
NbjupVo5QgoWrOuUoDPjpLt9+L/m</SQL><ServerConnection URL="http://10.10.3.75:8080/RexServer/RexService.jsp" DataType=""><Parameter Name="service" ValueType="0" Value="JNDI1" ValueFieldID="-1" ValueFieldIndex="-1"/><Parameter Name="servicetype" ValueType="0" Value="run" ValueFieldID="-1" ValueFieldIndex="-1"/></ServerConnection></DataSetting><GlobalStyleManager/><Page Gutter="0" MirrorMargin="0" Orientation="1" PaperSize="2" PaperWidth="2100" PaperHeight="2970" ReportWidth="2100" TopMargin="50" LeftMargin="50" BottomMargin="50" RightMargin="50"/><Page Gutter="0" MirrorMargin="0" Orientation="1" PaperSize="2" PaperWidth="2100" PaperHeight="2970" ReportWidth="2100" TopMargin="50" LeftMargin="50" BottomMargin="50" RightMargin="50"><Section Type="1" Name="보고서머리글" Height="280" Visible="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" CanGrow="0" CanShrink="0" ColumnWidth="0" ColumnDirection="0" ColumnSpacing="0" ColumnLayout="0" Repeat="0" UnderlayNext="0" DetailIteration="0" ForcedGH="0" KeepTogether="1" NewColumn="0" NewPage="0" PrintAtBottom="0" PageReset="0" SuppressBlankSection="0" SuppressRepeatedBlankSection="0" FillBlank="0" Exportable="1" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0" GroupFieldID="-1" GroupFieldIndex="-1" GroupSortingFieldID="-1" GroupSortingFieldIndex="-1" GroupTOCFieldID="-1" GroupTOCFieldIndex="-1"><ListControls Type="0"/><ListControls Type="1"><Control Type="Control.Label" Name="글상자1" Visible="0" X1="675" Y1="0" Width="650" Height="150" LineStyle="0" LineWidth="0.75" LineColor="0" RoundRate="0" SquareRound="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="0" VerticalAlignment="1" Text="Rexpert XML 테스트" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="20" FontBold="1" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0"><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/></Control><Control Type="Control.Label" Name="글상자2" Visible="0" X1="850" Y1="200" Width="300" Height="50" LineStyle="0" LineWidth="0.75" LineColor="0" RoundRate="0" SquareRound="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="0" VerticalAlignment="0" Text="" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0"><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/></Control><Control Type="Control.Field" Name="필드1" Visible="0" X1="50" Y1="200" Width="300" Height="50" LineStyle="0" LineWidth="0.75" LineColor="0" RoundRate="0" SquareRound="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="0" VerticalAlignment="0" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" CanGrow="0" CanShrink="0" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" Text="?test_data" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0" FieldID="2" FieldIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/></Control><Control Type="Control.Field" Name="필드2" Visible="0" X1="850" Y1="200" Width="300" Height="50" LineStyle="0" LineWidth="0.75" LineColor="0" RoundRate="0" SquareRound="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="0" VerticalAlignment="0" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" CanGrow="0" CanShrink="0" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" Text="%PrintTime" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0" FieldID="0" FieldIndex="6"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/></Control><Control Type="Control.MarkAnyCopyProtector" Name="컨트롤1" Visible="0" X1="1550" Y1="14" Width="220" Height="250"><ConditionalStyles/></Control></ListControls><ConditionalStyles/><Script><![CDATA[]]></Script></Section><Section Type="4" Name="페이지머리글" Height="150" Visible="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" CanGrow="0" CanShrink="0" ColumnWidth="0" ColumnDirection="0" ColumnSpacing="0" ColumnLayout="0" Repeat="0" UnderlayNext="0" DetailIteration="0" ForcedGH="0" KeepTogether="1" NewColumn="0" NewPage="0" PrintAtBottom="0" PageReset="0" SuppressBlankSection="0" SuppressRepeatedBlankSection="0" FillBlank="0" Exportable="1" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0" GroupFieldID="-1" GroupFieldIndex="-1" GroupSortingFieldID="-1" GroupSortingFieldIndex="-1" GroupTOCFieldID="-1" GroupTOCFieldIndex="-1"><ListControls Type="0"/><ListControls Type="1"><Control Type="Control.Table" Name="표3" Visible="0" X1="50" Y1="50" Width="1900" Height="100" FitSection="0" LinkIndex="3" RoundLeftTopEdge="0" RoundRightTopEdge="0" RoundRightBottomEdge="0" RoundLeftBottomEdge="0" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0"><CellStyles><CellStyle LeftLineStyle="1" RightLineStyle="1" TopLineStyle="1" BottomLineStyle="1" FDiagonalLineStyle="0" BDiagonalLineStyle="0" LeftLineWidth="0.75" RightLineWidth="0.75" TopLineWidth="0.75" BottomLineWidth="0.75" FDiagonalLineWidth="0.75" BDiagonalLineWidth="0.75" LeftLineColor="0" RightLineColor="0" TopLineColor="0" BottomLineColor="0" FDiagonalLineColor="0" BDiagonalLineColor="0"/></CellStyles><Rows><Row Size="100"><Cell CellType="0" BackStyle="1" BackColor="10092543" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="0" Text="NO" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="-1" FieldIndex="-1" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell><Cell CellType="0" BackStyle="1" BackColor="10092543" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="0" Text="법인명" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="-1" FieldIndex="-1" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell><Cell CellType="0" BackStyle="1" BackColor="10092543" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="0" Text="공시제목" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="-1" FieldIndex="-1" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell><Cell CellType="0" BackStyle="1" BackColor="10092543" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="0" Text="제출인" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="-1" FieldIndex="-1" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell><Cell CellType="0" BackStyle="1" BackColor="10092543" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="0" Text="접수일자" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="-1" FieldIndex="-1" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell></Row></Rows><Cols><Col Size="150"/><Col Size="300"/><Col Size="800"/><Col Size="300"/><Col Size="350"/></Cols><ConditionalStyles/></Control></ListControls><ConditionalStyles/><Script><![CDATA[]]></Script></Section><Section Type="64" Name="본문" Height="100" Visible="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" CanGrow="0" CanShrink="0" ColumnWidth="0" ColumnDirection="0" ColumnSpacing="0" ColumnLayout="0" Repeat="0" UnderlayNext="0" DetailIteration="0" ForcedGH="0" KeepTogether="1" NewColumn="0" NewPage="0" PrintAtBottom="0" PageReset="0" SuppressBlankSection="0" SuppressRepeatedBlankSection="1" FillBlank="0" Exportable="1" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0" GroupFieldID="-1" GroupFieldIndex="-1" GroupSortingFieldID="-1" GroupSortingFieldIndex="-1" GroupTOCFieldID="-1" GroupTOCFieldIndex="-1"><ListControls Type="0"/><ListControls Type="1"><Control Type="Control.Table" Name="표2" Visible="0" X1="50" Y1="0" Width="1900" Height="100" FitSection="0" LinkIndex="4" RoundLeftTopEdge="0" RoundRightTopEdge="0" RoundRightBottomEdge="0" RoundLeftBottomEdge="0" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0"><CellStyles><CellStyle LeftLineStyle="1" RightLineStyle="1" TopLineStyle="1" BottomLineStyle="1" FDiagonalLineStyle="0" BDiagonalLineStyle="0" LeftLineWidth="0.75" RightLineWidth="0.75" TopLineWidth="0.75" BottomLineWidth="0.75" FDiagonalLineWidth="0.75" BDiagonalLineWidth="0.75" LeftLineColor="0" RightLineColor="0" TopLineColor="0" BottomLineColor="0" FDiagonalLineColor="0" BDiagonalLineColor="0"/></CellStyles><Rows><Row Size="100"><Cell CellType="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="1" Text="@seqNum" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="1" FieldIndex="3" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell><Cell CellType="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="1" Text="@corpName" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="1" FieldIndex="0" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell><Cell CellType="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="0" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="1" Text="@noticeTitle" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="1" FieldIndex="1" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell><Cell CellType="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="1" Text="@submitName" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="1" FieldIndex="4" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell><Cell CellType="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" Alignment="1" VerticalAlignment="1" CanGrow="0" CanShrink="0" DataType="1" Text="@receipDate" MultiLine="1" WordWrap="1" WordSpace="0" LineSpace="0" Editable="0" AutoFontSize="0" RowSpan="1" ColSpan="1" OutputFormat="" ReplaceEmpty="" SuppressIfDuplication="0" SuppressIfZero="0" SuppressText="" MergeIfSuppress="0" MergeColumn="0" AddEnterWhenMergeColumn="0" SummaryFunction="0" TopMargin="0" LeftMargin="0" BottomMargin="0" RightMargin="0" FontName="굴림" FontSize="9" FontBold="0" FontUnderline="0" FontItalic="0" FontStrike="0" ForeColor="0" FieldID="1" FieldIndex="2" StyleIndex="0"><FieldReferences/><SummaryCondition/><HyperLinkInfo LinkType="0" LinkText="" ToolTipType="0" ToolTipText="" LinkFieldID="-1" LinkFieldIndex="-1" ToolTipFieldID="-1" ToolTipFieldIndex="-1"/><ConditionalStyles/><FieldReferences/></Cell></Row></Rows><Cols><Col Size="150"/><Col Size="300"/><Col Size="800"/><Col Size="300"/><Col Size="350"/></Cols><ConditionalStyles/></Control></ListControls><ConditionalStyles/><Script><![CDATA[]]></Script></Section><Section Type="2" Name="보고서바닥글" Height="100" Visible="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" CanGrow="0" CanShrink="0" ColumnWidth="0" ColumnDirection="0" ColumnSpacing="0" ColumnLayout="0" Repeat="0" UnderlayNext="0" DetailIteration="0" ForcedGH="0" KeepTogether="1" NewColumn="0" NewPage="0" PrintAtBottom="0" PageReset="0" SuppressBlankSection="0" SuppressRepeatedBlankSection="0" FillBlank="0" Exportable="1" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0" GroupFieldID="-1" GroupFieldIndex="-1" GroupSortingFieldID="-1" GroupSortingFieldIndex="-1" GroupTOCFieldID="-1" GroupTOCFieldIndex="-1"><ListControls Type="0"/><ListControls Type="1"/><ConditionalStyles/><Script><![CDATA[]]></Script></Section><Section Type="8" Name="페이지바닥글" Height="314" Visible="0" BackStyle="0" BackColor="16777215" FillStyle="0" FillColor="0" CanGrow="0" CanShrink="0" ColumnWidth="0" ColumnDirection="0" ColumnSpacing="0" ColumnLayout="0" Repeat="0" UnderlayNext="0" DetailIteration="0" ForcedGH="0" KeepTogether="1" NewColumn="0" NewPage="0" PrintAtBottom="0" PageReset="0" SuppressBlankSection="0" SuppressRepeatedBlankSection="0" FillBlank="0" Exportable="1" ExportLeft="0" ExportTop="0" ExportRight="0" ExportBottom="0" GroupFieldID="-1" GroupFieldIndex="-1" GroupSortingFieldID="-1" GroupSortingFieldIndex="-1" GroupTOCFieldID="-1" GroupTOCFieldIndex="-1"><ListControls Type="0"/><ListControls Type="1"><Control Type="Control.MarkAnyBarCode" Name="컨트롤2" Visible="0" X1="50" Y1="50" Width="1900" Height="200" DataFieldID="-1" DataFieldIndex="-1"><ConditionalStyles/></Control></ListControls><ConditionalStyles/><Script><![CDATA[]]></Script></Section></Page><Page Gutter="0" MirrorMargin="0" Orientation="1" PaperSize="2" PaperWidth="2100" PaperHeight="2970" ReportWidth="2100" TopMargin="50" LeftMargin="50" BottomMargin="50" RightMargin="50"/></Report>