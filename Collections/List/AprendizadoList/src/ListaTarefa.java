import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List <Tarefas> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }
public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefas(descricao));
}
public void removerTarefa(String descricao){
    List<Tarefas> tarefasParaRemover = new ArrayList<>();
    for (Tarefas t : tarefasParaRemover) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefasParaRemover.add(t);
        }
    }
    tarefaList.removeAll(tarefasParaRemover);
}
public int obterNumeroTotalTarefas(){
    return tarefaList.size();
}
public void obterDescricoesTarefas(){
    System.out.println(tarefaList);
}
public static void main(String[] args) {
    ListaTarefa listatarefa = new ListaTarefa();
    System.out.println("o numero de elementos é: "+ listatarefa.obterNumeroTotalTarefas());
    
    listatarefa.adicionarTarefa("Tarefa 1");
    System.out.println("o numero de elementos é: "+ listatarefa.obterNumeroTotalTarefas());

    listatarefa.adicionarTarefa("Tarefa 1");
    System.out.println("o numero de elementos é: "+ listatarefa.obterNumeroTotalTarefas());

    listatarefa.adicionarTarefa("Tarefa 1");
    System.out.println("o numero de elementos é: "+ listatarefa.obterNumeroTotalTarefas());

    listatarefa.removerTarefa("Tarefa 1");
    System.out.println("o numero de elementos é: "+ listatarefa.obterNumeroTotalTarefas());

    listatarefa.removerTarefa("Tarefa 1");
    System.out.println("o numero de elementos é: "+ listatarefa.obterNumeroTotalTarefas());

    listatarefa.obterDescricoesTarefas();
    





}

}

