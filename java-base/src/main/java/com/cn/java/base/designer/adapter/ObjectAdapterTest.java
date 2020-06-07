package com.cn.java.base.designer.adapter;


/**
 * ������
 * @author Administrator
 *
 */
public class ObjectAdapterTest {
	
    public static void main(String[] args) {  
    	
		
        TriplexOutlet triplexOutlet = new TriplexOutlet();
        
        Adapter duplexOutlet = new Adapter(triplexOutlet);
        
        Plug duplexPlug = new Plug();
        
        duplexPlug.insert(duplexOutlet);
        
    }

}
