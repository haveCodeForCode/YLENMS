/** 对jquery的ajax方法再次封装 */
_ajax = function(url, data, type) {
	var config = {
		url : url,
		type : type,
		dataType : "json",
		data : data,
		async:false, 
		success : function(result) {
			simpleSuccess(result);
		}
	};
	$.ajax(config)
};
/** 返回结果处理 */
function simpleSuccess(result) {
	if (result.code == web_status.SUCCESS) {
		$.modal.msg(result.msg, modal_status.SUCCESS);
	//	$.refreshTable();
	} else {
		$.modal.alert(result.msg, modal_status.FAIL);
	}
}

/** 页面字典值替换 */
_ajax_dict = function(dictType, value) {
	var tmp;
	$.ajax({
		url : "/system/dict/data/dict",
		data : {
			"data" : dictType
		},
		dataType : "json",
		async : false,
		success : function(data) {
			var i = 0;
			for (i = 0; i < data.length; i++) {
				if (data[i].dictValue == value) {
					tmp = '<span class="badge badge-primary">' + data[i].dictLabel + '</span>';
					if(dictType == 'tbl_status'){
						if(value == '1'){
							tmp = '<span class="badge badge-warning">' + data[i].dictLabel + '</span>';							
						}else if(value == '2'){
							tmp = '<span class="badge badge-success">' + data[i].dictLabel + '</span>';														
						}else if(value == '3'){
							tmp = '<span class="badge badge-danger">' + data[i].dictLabel + '</span>';																					
						}
					}
					break;
				}
			}
			if (i == data.length) {
				return '<span class="badge badge-danger">无效</span>';
			}
		},
		error : function() {
			return '<span class="badge badge-danger">无效</span>';
		}
	});
	return tmp;
}
/** 图片保存 */
_ajax_file_upload = function (module,path,fileId) {
	var fileObj = document.getElementById(fileId).files[0]; // js 获取文件对象
	if (typeof (fileObj) == "undefined" || fileObj.size <= 0) {
		return;
	}
	var file = fileObj;
	var formData = new FormData();
	formData.append("file", fileObj);// 加入文件对象
	formData.append("path", path);// 路径
	var tmp = '';
	// 第一种 XMLHttpRequest 对象
	// 胜利ar xhr = new XMLHttpRequest();
	// xhr.open("post", "/Admin/Ajax/VMKHandler.ashx", true);
	// xhr.onload = function () {
	// alert("上传完成!");
	// };
	// xhr.send(formFile);

	// 第二种 ajax 提交

	$.ajax({
		url : ctx + "module/" + module+"/upload",
		data : formData,
		type : "Post",
		async : false,
		cache : false,// 上传文件无需缓存
		processData : false,// 用于对data参数进行序列化处理 这里必须false
		contentType : false, // 必须
		success : function(result) {
			tmp = result;
		},
	});
	return tmp;
}

/** 弹出层指定宽度 */
function layer_show(title, url, w, h) {
	if (title == null || title == '') {
		title = false;
	}
	;
	if (url == null || url == '') {
		url = "404.html";
	}
	;
	if (w == null || w == '') {
		w = 800;
	}
	;
	if (h == null || h == '') {
		h = ($(window).height() - 50);
	}
	;
	layer.open({
		type : 2,
		area : [ w + 'px', h + 'px' ],
		fix : false,
		// 不固定
		maxmin : true,
		shade : 0.4,
		title : title,
		content : url
	});
}

/** 弹出层自动宽高 */
function layer_showAuto(title, url) {
	layer_show(title, url, '', '');
}

/** 关闭弹出框口 */
function layer_close() {
	var index = parent.layer.getFrameIndex(window.name);
	parent.layer.close(index);
}

/** 字符串拼接(input) */
_ajax_text_str = function(dictType, value) {
	var dataStr = '';
	var num = 0;
	$.ajax({
		url : "/system/dict/data/dict",
		data : {
			"data" : dictType
		},
		dataType : "json",
		async : false,
		success : function(data) {
			var i = 0;
			for (i = 0; i < data.length; i++) {
				console.log(data[i].dictValue);
				var tmp = value + data[i].dictValue;
				var tmpText = value + 'Text' + data[i].dictValue;
				var attr = $('#' + tmp).val();
				var attrText = $('#' + tmpText).text();
				if(attr == ''){
					attr = 0;
				}
				if(i != data.length-1){
					dataStr += attrText + ":" + attr + ",";
				}else{
					dataStr += attrText + ":" + attr;
				}
				num += Number(attr);
			}
		},
		error : function() {
		}
	});
	var dataStrReg = dataStr.replace(":","");
	dataStrReg = dataStrReg.replace(",","");
	alert(num);	
	if(num != 100){
		alert("配比值总和应为100");
		dataStr = 'false';
	}
	if (dataStrReg.length > 0) {
	} else {
		alert("请选择相关信息");
		dataStr = 'false';
	}
	return dataStr;
}


/** 字符串拼接(选框) */
_ajax_str = function(dictType, value) {
	var dataStr = '';
	$.ajax({
		url : "/system/dict/data/dict",
		data : {
			"data" : dictType
		},
		dataType : "json",
		async : false,
		success : function(data) {
			var i = 0;
			for (i = 0; i < data.length; i++) {
				console.log(data[i].dictValue);
				var tmp = value + data[i].dictValue;
				var tmpText = value + 'Text' + data[i].dictValue;
				if ($('#' + tmp).is(":checked")) {
					$('#' + tmp).val("Y");
				} else {
					$('#' + tmp).val("N");
				}
				var attr = $('#' + tmp).val();
				var attrText = $('#' + tmpText).text();
				if (attr == 'Y') {
					dataStr += attrText + ",";
				}

			}
		},
		error : function() {
		}
	});
	if (dataStr.replace(",","").length > 0) {
		dataStr = dataStr.substring(0, dataStr.length - 1);
	} else {
		alert("请选择相关信息");
		dataStr = 'false';
	}
	return dataStr;
}

/** 字符串拼接(单独) */
_ajax_only_str =function (dictType, value) {
	var dataStr = '';
	$.ajax({
		url : "/system/dict/data/dict",
		data : {
			"data" : dictType
		},
		dataType : "json",
		async : false,
		success : function(data) {
			var i = 0;
			for (i = 0; i < data.length; i++) {
				console.log(data[i].dictValue);
				var tmp = value + data[i].dictValue;
				if( $('#' + tmp).is("input") ){
					var attr = $('#' + tmp).val();
				}else{
					var attr = $('#' + tmp).text();
				}
				if(attr == ''){
					attr = 0;
				}
				if(i != data.length-1){
					dataStr += attr + ",";
				}else{
					dataStr += attr;
				}
				
			}
		},
		error : function() {
		}
	});
	var dataStrReg = dataStr.replace(",","");
	if (dataStrReg.length > 0) {
	} else {
		alert("请选择相关信息");
		dataStr = 'false';
	}
	return dataStr;
}
/** 判断选定参数并查询 */
_bootstrap_search_tablename = function(tablename,param){
/*	var rows=$.common.isEmpty($.table._option.id)?$.table.selectFirstColumns():$.table.selectColumns($.table._option.id);
	//选中数据
	if(rows.length==0){$.modal.alertWarning("请至少选择一条记录");return}
	if(rows.length>1){$.modal.alertWarning("只可选择一条记录");return}*/
    var params=$(tablename).bootstrapTable("getOptions");
//    var paramName = name;
//    var data = param;
    params.queryParams=function(params) {
        var search = {};
        //搜索表单数据
        //search[paramName] = data;
        search = param;
        search.pageSize = params.limit;
        search.pageNum = params.offset / params.limit + 1;
        search.searchValue = params.search;
        search.orderByColumn = params.sort;
        search.isAsc = params.order;
        search.silent=true;
        return search;
		}
		$(tablename).bootstrapTable("refresh",params)
	}

/** 不同id的table展示 */
_bootstrap_show =function(options,bootid){
    $.table._option=options;
    $.table._params=$.common.isEmpty(options.queryParams)?$.table.queryParams:options.queryParams;
    _sortOrder=$.common.isEmpty(options.sortOrder)?"asc":options.sortOrder;
    _sortName=$.common.isEmpty(options.sortName)?"":options.sortName;
    $("#"+bootid).bootstrapTable({
        url:options.url,
        contentType:"application/x-www-form-urlencoded",
        method:"post",
        cache:false,
        sortable:true,
        sortStable:true,
        sortName:_sortName,
        sortOrder:_sortOrder,
        pagination:true,
        pageNumber:1,
        pageSize:10,
        pageList:[10,25,50],
        iconSize:"outline",
        toolbar:"#toolbar",
        sidePagination:"server",
        search:$.common.visible(options.search),
        showRefresh:$.common.visible(options.showRefresh),
        showColumns:$.common.visible(options.showColumns),
        showToggle:$.common.visible(options.showToggle),
        showExport:$.common.visible(options.showExport),
        queryParams:$.table._params,columns:options.columns})}


/** 判断选定参数并查询 */
_bootstrap_search = function(name,data){
/*	var rows=$.common.isEmpty($.table._option.id)?$.table.selectFirstColumns():$.table.selectColumns($.table._option.id);
	//选中数据
	if(rows.length==0){$.modal.alertWarning("请至少选择一条记录");return}
	if(rows.length>1){$.modal.alertWarning("只可选择一条记录");return}*/
    var params=$("#bootstrap-table").bootstrapTable("getOptions");
    var paramName = name;
    var data = data;
    params.queryParams=function(params) {
        var search = {};
        //搜索表单数据
        search[paramName] = data;
        search.pageSize = params.limit;
        search.pageNum = params.offset / params.limit + 1;
        search.searchValue = params.search;
        search.orderByColumn = params.sort;
        search.isAsc = params.order;
        return search;
		}
		$("#bootstrap-table").bootstrapTable("refresh",params)
	}

/** 判断选定参数并查询 */
_bootstrap_search_tablename = function(tablename,param){
/*	var rows=$.common.isEmpty($.table._option.id)?$.table.selectFirstColumns():$.table.selectColumns($.table._option.id);
	//选中数据
	if(rows.length==0){$.modal.alertWarning("请至少选择一条记录");return}
	if(rows.length>1){$.modal.alertWarning("只可选择一条记录");return}*/
    var params=$(tablename).bootstrapTable("getOptions");
//    var paramName = name;
//    var data = param;
    params.queryParams=function(params) {
			var search = {};
		    // 搜索表单数据
		    // search[paramName] = data;
		    search = param;

		    search.pageSize = params.limit;
		    search.pageNum = params.offset / params.limit + 1;
		    search.searchValue = params.search;
		    search.orderByColumn = params.sort;
		    search.isAsc = params.order;
		    search.silent = true;
		    return search;
		}
		$(tablename).bootstrapTable("refresh",params)
    	//alert("refresh");
	}
// 查询选中列值
_bootstrap_selectColumns = function(bootid,column) {
    return $.map($('#'+bootid).bootstrapTable('getSelections'), function (row) {
        return row[column];
    });
}
// 查询选中首列值
_bootstrap_selectFirstColumns = function(bootid) {
return $.map($('#'+bootid).bootstrapTable('getSelections'), function (row) {
	return row[$.table._option.columns[1].field];
});
}