package com.cn.java.base.designer.adapter;


/**
 * ������
 * @author Administrator
 *
 */
public class Adapter implements DuplexOutlet{
	
	private TriplexOutlet triplexOutlet;
	
	public Adapter(TriplexOutlet triplexOutlet) {
        this.triplexOutlet = triplexOutlet;
    }
	

	public void useTwoHoles() {
	
	    System.out.println("���Ǹ�������������ܹ���˫�׵�ת�������׵ġ�");
        triplexOutlet.useThressHoles();	
	}
	
	
}
