function createPhase() {
    var no_phase = document.getElementById("product").value;
    var str="";
    if(no_phase>0){
        for (i = 1; i <= no_phase; i++) {
            str = str + "<tr>";
            str = str + "<td><label class=" + '"' + "form - label" + '"' + "><strong>Phase " + i + "</strong></label></td>";
            str =str + "<td><form:input path="+ '"' +"job_ds"+'"'+"type="+'"'+"text"+'"'+"/></td>";
            str = str +"</tr>"
        }
        document.getElementById("form-phase").innerHTML = str;
    }
}