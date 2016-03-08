package prob2;

public class Goods {
	
	//field
	private String goods;
	private String price;
	private String number;
	
	//constructor
	public Goods(String goods, String price, String number) {
		super();
		this.goods = goods;
		this.price = price;
		this.number = number;
	}
	
	//getter&setter
	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return goods+"(가격:"+price+"원)이 "+number+"개 입고 되었습니다.";
	}
}
