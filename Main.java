import java.util.Date;

// Declaração da Classe Abstract BasePessoa.
abstract class BasePessoa
{
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private Date dataNascimento;
    private String rg;
    private String cpf;
    private Date dataInsercao;

    // Construtor da classe BasePessoa, com os atributos solicitados.
    public BasePessoa(int codigo, String nome, String endereco, String telefone, Date dataNascimento, String rg, String cpf, Date dataInsercao) 
    {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.dataInsercao = dataInsercao;
    }
}

//Classe derivada Professor, deriva de BasePessoa.
class Professor extends BasePessoa 
{
    private String registro;
    private Date dataContratacao;
    //Construtor da classe Professor.
    //Chama o construtor da classe base e inicializa os atributos adicionais.
    public Professor(int codigo, String nome, String endereco, String telefone, Date dataNascimento, String rg, String cpf, Date dataInsercao, String registro, Date dataContratacao) 
    {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }
}

//Classe derivada Aluno, deriva de BasePessoa.
class Aluno extends BasePessoa 
{
    private String matricula;
    private Date dataMatricula;
    //Construtor da classe Aluno.
    //Chama o construtor da classe base e inicializa os atributos adicionais.
    public Aluno(int codigo, String nome, String endereco, String telefone, Date dataNascimento, String rg, String cpf, Date dataInsercao, String matricula, Date dataMatricula) 
    {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
}

//Classe principal.
public class Main 
{
    public static void main(String[] args) 
    {
        Date dataAtual = new Date();

        // Instanciando um objeto Professor e um objeto Aluno.
        Professor professor = new Professor(1, "Luizão", "Av. Ceara 1234", "67-1234-5678", dataAtual, "1234567", "123456789", dataAtual, "01", dataAtual);
        Aluno aluno = new Aluno(2, "Emerson", "Mato Grosso 5678", "67-8765-4321", dataAtual, "7654321", "987654321", dataAtual, "02", dataAtual);
    }
}