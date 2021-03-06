package com.fincatto.nfe200.transformers;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.nfe200.classes.NFTipoImpressao;

class NFTipoImpressaoTransformer implements Transform<NFTipoImpressao> {
	
	@Override
	public NFTipoImpressao read(final String codigo) throws Exception {
		return NFTipoImpressao.valueOfCodigo(codigo);
	}
	
	@Override
	public String write(final NFTipoImpressao tipo) throws Exception {
		return tipo.getCodigo();
	}
}