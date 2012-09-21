    function validate(){
    	$frm = document.forms["formAtt"];
    	$group1 = $frm.grp1yes.value;
    	$listBoxSelection=document.getElementById("dropdown").value;
    	if($group1 == "yes"){
    	    $grp1value = $('input:radio').attr("value");
            $writer = new FileWriter("/sdcard/AgaHistory/ST Mobile Device.xml"); 
            $writer.write("<?xml version='1.0' encoding='utf-8'?>\n"+
            			"<ChecklistName>ST Mobile Device - Stoping Capture Form</ChecklistName>\n"+
            		  "<ChecklistGroups>\n"+
            		   " <ChecklistGroupXML>\n"+
            		   "   <ChecklistGroupID>10210913</ChecklistGroupID>\n"+
            		   "   <ParentChecklistGroupID>0</ParentChecklistGroupID>\n"+
            		   "   <ChecklistGroupName>GROUP 1</ChecklistGroupName>\n"+
            		   "        <ChecklistItemXML>\n"+
            		   "      <ChecklistItemID>29987461</ChecklistItemID>\n"+
            		   "      <ChecklistItemName>ITEM 1</ChecklistItemName>\n"+
            		   "        <UnitOfMeasure>\n"+
            		   "        <UnitOfMeasureID>1</UnitOfMeasureID>\n"+
            		   "        <UnitOfMeasureName>"+$grp1value+"</UnitOfMeasureName>\n"+
            		   "        </UnitOfMeasure>\n"+
            		   "        </ChecklistItemXML>\n"+
            		   "  </ChecklistItems>\n"+
            		   "</ChecklistGroupXML>\n" +
            		   " <ChecklistGroupXML>\n"+
            		   "   <ChecklistGroupID>10210914</ChecklistGroupID>\n"+
            		   "   <ParentChecklistGroupID>0</ParentChecklistGroupID>\n"+
            		   "   <ChecklistGroupName>GROUP 2</ChecklistGroupName>\n"+
            		   "        <ChecklistItemXML>\n"+
            		   "      <ChecklistItemID>29987461</ChecklistItemID>\n"+
            		   "      <ChecklistItemName>ITEM 2</ChecklistItemName>\n"+
            		   "        <UnitOfMeasure>\n"+
            		   "        <UnitOfMeasureID>45</UnitOfMeasureID>\n"+
            		   "        <UnitOfMeasureName>DropDownList Measure</UnitOfMeasureName>\n"+
            		   "        </UnitOfMeasure>\n"+
            		   "        <CustomCategory>\n"+
            		   "              <CustomCategoryID>1</CustomCategoryID>\n "+
            		   "              <ValueDataTypeID>5</ValueDataTypeID>\n"+
            		   "              <CustomCategoryName>Occupations (p.59)</CustomCategoryName>\n"+
            		   "              <CustomValues>\n"+
            		   "                 <CustomValueXML>\n"+
            		   "                 <CustomValueID>1</CustomValueID>\n"+
            		   "                 <CustomCategoryID>1</CustomCategoryID>\n"+
            		   " 				 <ParentID>0</ParentID>\n"+
            		   " 				 <DMECode>70301</DMECode>\n"+
            		   " 				 <cvString>"+$listBoxSelection+"</cvString>\n"+
            		   "        </CustomCategory>\n"+
            		   "        </ChecklistItemXML>\n"+
            		   "  </ChecklistItems>\n"+
            		   "</ChecklistGroupXML>\n"+
            		   " <ChecklistGroupXML>\n"+
            		   "   <ChecklistGroupID>10210915</ChecklistGroupID>\n"+
            		   "   <ParentChecklistGroupID>0</ParentChecklistGroupID>\n"+
            		   "   <ChecklistGroupName>GROUP 3</ChecklistGroupName>\n"+
            		   "        <ChecklistItemXML>\n"+
            		   "      <ChecklistItemID>29987463</ChecklistItemID>\n"+
            		   "      <ChecklistItemName>HIDE GROUP 2</ChecklistItemName>\n"+
            		   "        <UnitOfMeasure>\n"+
            		   "        <UnitOfMeasureID>1</UnitOfMeasureID>\n"+
            		   "        <UnitOfMeasureName>DropDownList Measure</UnitOfMeasureName>\n"+
            		   "        </UnitOfMeasure>\n"+
            		   "        </ChecklistItemXML>\n"+
            		   "  </ChecklistItems>\n"+
            		   "</ChecklistGroupXML>\n"
            		   , true);
            alert("New Data saved");
    	}
    	return false;
    }