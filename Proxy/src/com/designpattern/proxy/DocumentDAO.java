package com.designpattern.proxy;

public class DocumentDAO implements AbstractDocumentDAO{

	@Override
	public boolean deleteDocumentById(String documentId) {
		if(documentId.equals("设计模式的艺术")){
			System.out.println("查询ID为"+documentId+"的文档信息成功！");
			return true;
		}else{
			System.out.println("查询ID为"+documentId+"的文档信息失败！");
			return false;
		}
	}

}
