package de.uni.freiburg.iig.telematik.wolfgang.graph.handler;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxEdgeHandler;
import com.mxgraph.view.mxCellState;

import de.uni.freiburg.iig.telematik.wolfgang.graph.util.MXConstants;

public class EdgeHandler extends mxEdgeHandler {

	@Override
	public String getToolTipText(MouseEvent e) {
		// TODO Auto-generated method stub
		return "<html>double-click to add waypoint <br>right-click on waypoint delete it</html>";
	}

	public EdgeHandler(mxGraphComponent graphComponent, mxCellState state) {
		super(graphComponent, state);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	/**
	 * 
	 */
	protected Rectangle createHandle(Point center)
	{
		return createHandle(center, MXConstants.EDGE_HANDLE_SIZE);
	}

}
