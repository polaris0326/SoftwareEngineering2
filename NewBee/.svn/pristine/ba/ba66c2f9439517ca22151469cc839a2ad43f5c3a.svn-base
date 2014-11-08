package po;

import java.util.ArrayList;

import vo.CommodityVO;
import vo.TypeVO;

public class TypePO {
	
	
	
	public TypePO(String name, TypePO fatherType, ArrayList<TypePO> subTypes,
			ArrayList<CommodityPO> coms) {
		super();
		this.name = name;
		this.fatherType = fatherType;
		this.subTypes = subTypes;
		this.coms = coms;
	}
	public TypeVO creatTypeVO(){
		TypeVO fatherTypeVO=fatherType.creatTypeVO();
		ArrayList<TypeVO>subTypesVO=new ArrayList<TypeVO>();
		ArrayList<CommodityVO>comsVO=new ArrayList<CommodityVO>();
		for (TypePO tp:subTypes){
			subTypesVO.add(tp.creatTypeVO());
		}
		for(CommodityPO cm:coms){
			comsVO.add(cm.creatCommodityVO());
		}
		
		return new TypeVO(name, fatherTypeVO, subTypesVO, comsVO);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TypePO getFatherType() {
		return fatherType;
	}
	public void setFatherType(TypePO fatherType) {
		this.fatherType = fatherType;
	}
	public ArrayList<TypePO> getSubTypes() {
		return subTypes;
	}
	public void setSubTypes(ArrayList<TypePO> subTypes) {
		this.subTypes = subTypes;
	}
	public ArrayList<CommodityPO> getComs() {
		return coms;
	}
	public void setComs(ArrayList<CommodityPO> coms) {
		this.coms = coms;
	}

	String name;
	TypePO fatherType;
	ArrayList<TypePO> subTypes=null;
	ArrayList<CommodityPO> coms=null;

}
