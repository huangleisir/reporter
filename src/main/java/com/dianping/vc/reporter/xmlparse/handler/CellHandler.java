package com.dianping.vc.reporter.xmlparse.handler;

import com.dianping.vc.reporter.model.CellModel;
import com.dianping.vc.reporter.xmlparse.ModelHandler;
import com.dianping.vc.reporter.model.Model;
import org.xml.sax.Attributes;

/**
 * Created by chaishipeng on 2017/6/6.
 */
public class CellHandler extends AbstractModelHandler {
    public Model create() {
        return new CellModel();
    }
}
