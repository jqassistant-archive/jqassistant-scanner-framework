import * as _ from "lodash";
import { map as observableMap } from "rxjs";
import map from "lodash/map";
import { isEmpty } from "lodash";
import { isEqual, isNil } from "lodash";

interface IAnimal {
    legs: number;
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
    public spouse: Person;

    get surname(): string {
        return this.protectedString;
    }

    constructor(name: string) {
        this.name = name;
        _.get
    }

    hypotheticalFunction(): string {
        return this.privateString + this.name;
    }

    getCoupleLegCount(): number {
        return this.legs + this.spouse.legs;
    }

    functionWithParameters(partner: Person, married: boolean): string {
        return this.name + " and " + partner.name + (married ? " are " : " are not ") + "married";
    }

    Person(partner: Person, married: boolean): string {
        return this.name + " and " + partner.name + (married ? " are " : " are not ") + "married";
    }
    noParamsNoReturn() {
        const spouseName = "Alice " + this.surname;
        const spouse: Person = new Person(spouseName);
        this.spouse = spouse;
        const status = this.functionWithParameters(spouse, true);
        console.log(status);
    }
}

class Employee extends Person {
    empCode: number;
    static pi: number = 3.14;

    constructor(empcode: number, name:string) {
        super(name);
        this.empCode = empcode;
    }

    displayName(): string {
        console.log("Name = " + this.name +  ", Employee Code = " + this.empCode);
        run([]);
        return "Name = " + this.name +  ", Employee Code = " + this.empCode;
    }

    displayName2(prefix: string): string {
        beginFeast([]);
        run([]);
        return prefix + this.displayName();
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

// type Monk = Omit<Person, "spouse">;

function beginFeast(participants: Monster[]): void {
}

function run(animals: Array<IAnimal>): void {
}