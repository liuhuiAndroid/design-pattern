package com.designpattern.proxyprinciple;

public class DocumentDAO implements AbstractDocumentDAO {

	@Override
	public void deleteDocumentById() {
		System.out.println("查询ID为" + "Y" + "的文档信息失败！");
	}

}
