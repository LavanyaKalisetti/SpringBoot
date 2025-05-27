package com.nt.comp;

public class DTDC implements Courier {
	@Override
	public String deliver(int oid) {
		return oid+"order items are kept for delivery by DTDC";
	}

}
