package vo;

import java.io.Serializable;
import java.util.ArrayList;

import po.CommodityPO;
import po.TypePO;

public class TypeVO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TypeVO(String name, TypeVO fatherType, ArrayList<TypeVO> subTypes,
			ArrayList<CommodityVO> coms) {
		super();
		this.name = name;
		this.fatherType = fatherType;
		this.subTypes = subTypes;
		this.coms = coms;
	}
	
	String name;
	TypeVO fatherType;
	ArrayList<TypeVO> subTypes;
	ArrayList<CommodityVO> coms;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TypeVO getFatherType() {
		return fatherType;
	}
	public void setFatherType(TypeVO fatherType) {
		this.fatherType = fatherType;
	}
	public ArrayList<TypeVO> getSubTypes() {
		return subTypes;
	}
	public void setSubTypes(ArrayList<TypeVO> subTypes) {
		this.subTypes = subTypes;
	}
	public ArrayList<CommodityVO> getComs() {
		return coms;
	}
	public void setComs(ArrayList<CommodityVO> coms) {
		this.coms = coms;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public TypePO createPO() {
		ArrayList<CommodityPO> pos1=new ArrayList<CommodityPO>();
		for (CommodityVO vo: coms){
			pos1.add(vo.createPO());
		}
		
		ArrayList<TypePO> pos2=new ArrayList<TypePO>();
		for (TypeVO vo: subTypes){
			pos2.add(vo.createPO());
		}
		TypePO fatherType1= fatherType.createPO();
		return new TypePO(name,fatherType1, pos2, pos1);
	}

}
