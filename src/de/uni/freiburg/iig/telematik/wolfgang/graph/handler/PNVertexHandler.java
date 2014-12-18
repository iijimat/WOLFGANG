package de.uni.freiburg.iig.telematik.wolfgang.graph.handler;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxVertexHandler;
import com.mxgraph.view.mxCellState;

import de.uni.freiburg.iig.telematik.wolfgang.graph.PNGraph;

public class PNVertexHandler extends mxVertexHandler {

	public PNVertexHandler(mxGraphComponent graphComponent, mxCellState state) {
		super(graphComponent, state);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isHandleVisible(int index) {
		// TODO Auto-generated method stub
		 return !isLabel(index) || (isLabelMovable()&& ((PNGraph) getGraphComponent().getGraph()).isLabelSelected());
	}

}
