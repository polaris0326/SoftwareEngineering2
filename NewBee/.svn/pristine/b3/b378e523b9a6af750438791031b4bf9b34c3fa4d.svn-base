package vo;

import java.io.Serializable;
import java.util.ArrayList;

import po.CommodityTreePO;
import po.TypePO;


public class CommodityTreeVO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommodityTreeVO(ArrayList<TypeVO> roots) {
		super();
		this.roots = roots;
	}
	public CommodityTreePO createPO(){
		ArrayList<TypePO> pos=new ArrayList<TypePO>();
		for (TypeVO vo: roots){
			pos.add(vo.createPO());
		}
		return new CommodityTreePO(pos);
	}
	public CommodityTreeVO() {
		// TODO 自动生成的构造函数存根
	}

	ArrayList<TypeVO> roots;

	public ArrayList<TypeVO> getRoots() {
		return roots;
	}

	public void setRoots(ArrayList<TypeVO> roots) {
		this.roots = roots;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
