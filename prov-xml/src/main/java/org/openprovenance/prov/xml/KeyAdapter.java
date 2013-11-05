package org.openprovenance.prov.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.namespace.QName;

import org.openprovenance.prov.model.DOMProcessing;
import org.openprovenance.prov.model.NamespacePrefixMapper;
import org.w3c.dom.Element;

public class KeyAdapter extends XmlAdapter<Element, TypedValue> {

    
    final org.openprovenance.prov.model.ProvFactory pFactory;
    final ValueConverter vconv;

    public KeyAdapter() {
	pFactory= new ProvFactory();
	vconv=new ValueConverter(pFactory);
    }



    @Override
    public Element marshal(TypedValue value) throws Exception {
         System.out.println("==> KeyAdapter marshalling for " + value);
         return DOMProcessing.marshalTypedValue(value,Helper.PROV_KEY_QNAME);
    }

    @Override
    public TypedValue unmarshal(Element el) throws Exception {
         System.out.println("==> KeyAdapter unmarshalling for " + el);
         //TODO: make sure I construct a typedvalue. Update newAttribute in xml.ProvFactory.
         return (TypedValue) DOMProcessing.unmarshallAttribute(el,pFactory,vconv);
    }

}