package Tarjan;

/**
 * Tarjan算法--有向图强连通分量算法
 * @author lyq
 *
 */
public class Client {
	public static void main(String[] args){
		//图构造数据文件地址
		String graphFilePath = "C:\\Users\\lyq\\Desktop\\icon\\graphData.txt";
		
		TarjanTool tool = new TarjanTool(graphFilePath);
		//下面这个方法为改造的一点方法，还有点问题
		//tool.searchStrongConnectedGraph();
		tool.standardSearchSCG();
	}
}
