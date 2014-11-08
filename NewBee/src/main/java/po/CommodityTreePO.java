package po;

import java.util.ArrayList;

import vo.CommodityTreeVO;

public class CommodityTreePO {
	
	public CommodityTreePO(ArrayList<TypePO> roots) {
		super();
		this.roots = roots;
	}
	public CommodityTreeVO creatCommodityTreeVO(){
		return new CommodityTreeVO();
	}

	public ArrayList<TypePO> getRoots() {
		return roots;
	}
	public void setRoots(ArrayList<TypePO> roots) {
		this.roots = roots;
	}

	ArrayList<TypePO> roots;

}
