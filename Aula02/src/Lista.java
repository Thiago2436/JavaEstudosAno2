
public class Lista {
	No A [] = new No [40];
	int fim = 0;
	void IsereFim(No x) {
	
	A[fim] = x;
	fim++;
	}
	 ListarAlunos() {
	int i;
	for(i=0; i<fim; i++) {
		System.out.println("Nome :"+A[i].getNome());
		System.out.println("Curso : "+A[i].getCurso());
	}
}
}
