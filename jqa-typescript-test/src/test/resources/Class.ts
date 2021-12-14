
interface IAnimal {
    legs: number
}

interface IPerson extends IAnimal {
    name: string;
}


class Person implements IPerson {
    public publicString: string;
    private privateString: string;
    protected protectedString: string;
    readonly readonlyString: string;
    name: string;
    public legs: number;

    constructor(name: string) {
        this.name = name;
    }

    hypotheticalFunction(): string {
        return this.privateString + this.name;
    }

    functionWithParameters(partner: Person, married: boolean): void {
        console.log(this.name + " and " + partner.name + (married ? " are " : " are not ") + "married")
    }
    noParamsNoReturn() {
        console.log("crazy")
    }
}

class Employee extends Person {
    empCode: number;
    static pi: number = 3.14;

    constructor(empcode: number, name:string) {
        super(name);
        this.empCode = empcode;
    }

    displayName():void {
        console.log("Name = " + this.name +  ", Employee Code = " + this.empCode);
    }
}

class Monster {
    eats: IAnimal;
}

export let steve = new Employee(100,"Steve");

const charlotte: Monster & IAnimal = {
    legs: 8,
    eats: steve
};

function beginFeast(participants: Monster[]): void {
}
function run(animals: Array<IAnimal>): void {
}