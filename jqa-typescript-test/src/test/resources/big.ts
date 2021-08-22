abstract class Person {
    name: string;

    constructor(name: string) {
        this.name = name;
    }

    abstract find(string): Person;
    abstract nameAbs: string;
}

class Employee extends Person {
    empCode: number;

    constructor(name: string, code: number) {
        super(name); // must call super()
        this.empCode = code;
    }

    find(name:string): Person {
        // execute AJAX request to find an employee from a db
        return new Employee(name, 1);
    }
}

let emp: Person = new Employee("James", 100);
emp.display(); //James

let emp2: Person = emp.find('Steve');


interface IPerson {
    name: string;
}

class Person implements IPerson {
    public publicString: string;
    private privateString: string;
    protected protectedString: string;
    readonly readonlyString: string;
    name: string;

    constructor(name: string) {
        this.name = name;
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

let emp = new Employee(100,"Steve");




namespace StringUtility
{
    function ToCapital(str: string): string {
        return str.toUpperCase();
    }

    function Nemw(str: string, length: number = 0): string {
        return str.toUpperCase();
    }
    export function Eported(from: string, length: number = 0): string {
        return from.toUpperCase();
    }

    export function Eported2(str: string, length: number = 0): string {
        return str.toUpperCase();
    }
}

function Sum(x: number, y: number) : void {
    console.log('processNumKeyPairs: key = ' + key + ', value = ' + value)
    return x + y;
}


let greeting = function() {
    console.log("Hello TypeScript!");
};

let SumAnon = function(x: number, y: number) : number
{
    return x + y;
}

function Greet(greeting: string, name?: string ) : string {
    return greeting + ' ' + name + '!';
}

function Greet2(name: string, greeting: string = "Hello") : string {
    return greeting + ' ' + name + '!';
}

Greet(undefined, 'Steve');

let sumArrow = (x: number, y: number): number => {
    return x + y
}

let Print = () => console.log("Hello TypeScript");

let sumShortArrow = (x: number, y: number) => x + y;

function Greet(greeting: string, ...names: string[]) {
    return greeting + " " + names.join(", ") + "!";
}


function Test(value: TestClass | TestClass2): value is TestClass {
    return (<TestClass>value).someFunction !== undefined;
}

function getArray<T>(items : T[] ) : T[] {
    return new Array<T>().concat();
}

let myNumArr = getArray<Test>([100, 200, 300]);
let myStrArr = getArray<string>(["Hello", "World"]);

myNumArr.push(400); // OK
myStrArr.push("Hello TypeScript"); // OK

myNumArr.push("Hi"); // Compiler Error
myStrArr.push(500); // Compiler Error


function displayType<T, U>(id:T, name:U): void {
    console.log(typeof(id) + ", " + typeof(name));
}

function displayTypeNon<T>(id:T, name:string): void {
    console.log(typeof(id) + ", " + typeof(name));
}

function displayNames<T>(names:T[]): void {
    console.log(names.join(", "));
}


function display<T extends Person>(per: T): void {
    console.log(`${ per.firstName} ${per.lastName}` );
}

class KeyValuePair<T,U>
{
    private key: T;
    private val: U;

    setKeyValue(key: T, val: U): void {
        this.key = key;
        this.val = val;
    }

    display():void {
        console.log(`Key = ${this.key}, val = ${this.val}`);
    }
}
let kvp1 = new KeyValuePair<number, string>();
kvp1.setKeyValue(1, "Steve");
kvp1.display(); //Output: Key = 1, Val = Steve

let kvp2 = new KayValuePair<string, string>();
kvp2.SetKeyValue("CEO", "Bill");
kvp2.display(); //Output: Key = CEO, Val = Bill


interface IKeyValueProcessor<T, U>
{
    process(key: T, val: U): void;
};

class kvProcessor<T, U> implements IKeyValueProcessor<T, U>
{
    process(key:T, val:U):void {
        console.log(`Key = ${key}, val = ${val}`);
    }
}


export interface IPerson {
    name: string;
    gender: string;
}

interface IEmployee extends IPerson{
    empCode: number;
    readonly empName: string;
    empDept?:string;
    getSalary: (number) => number; // arrow function
    getManagerName(number): string;
}


class Employee implements IEmployee {
    empCode: number;
    name: string;

    constructor(code: number, name: string) {
        this.empCode = code;
        this.name = name;
    }

    getSalary(empCode:number):number {
        return 20000;
    }
}
// Interface As type
interface KeyPair {
    key: number;
    value: string;
}

let kv1: KeyPair = { key:1, value:"Steve" }; // OK

let kv2: KeyPair = { key:1, val:"Steve" }; // Compiler Error: 'val' doesn't exist in type 'KeyPair'

let kv3: KeyPair = { key:1, value:100 }; // Compiler Error

//Interface for Array Type

interface NumList {
    [index:string]:string
}

let numArr: NumList = [1, 2, 3];
numArr[0];
numArr[1];

interface IStringList {
    [index:string]:string
}

let strArr : IStringList;
strArr["TS"] = "TypeScript";
strArr["JS"] = "JavaScript";

export let age : number = 20;
export class Employee {
    empCode: number;
    empName: string;
    constructor(name: string, code: number) {
        this.empName = name;
        this.empCode = code;
    }
    displayEmployee() {
        console.log ("Employee Code: " + this.empCode + ", Employee Name: " + this.empName );
    }
}
let companyName:string = "XYZ";

let x: number = 10, y = 20;

// If-else

if (x > y)
{
    console.log('x is greater than y.');
}
else
{
    console.log('x is less than or equal to y.'); //This will be executed
}

// Switch
switch (x-y) {
    case 0:
        console.log("Result: 0");
        break;
    case 5:
        console.log("Result: 5");
        break;
    case 10:
        console.log("Result: 10");
        break;
}

// For
for (let i = 0; i < 3; i++) {
    console.log ("Block statement execution no." + i);
}

let str = "Hello World";

for (var char of str) {
    console.log(char); // prints chars: H e l l o  W o r l d
}

let arr = [10, 20, 30, 40];

for (var index in arr) {
    console.log(index); // prints indexes: 0, 1, 2, 3

    console.log(arr[index]); // prints elements: 10, 20, 30, 40
}

// While
let i: number = 2;
do {
    console.log("Block statement execution no." + i )
    i++;
} while ( i < 4)

while (i < 4) {
    console.log( "Block statement execution no." + i )
    i++;
}


// TypeAnotation
var age: number = 32; // number variable
var name: string = "John";// string variable
var isUpdated: boolean = true;// Boolean variable

var employee : {
    id: number;
    name: string;
};

employee = {
    id: 100,
    name : "John"
}

function display(id:number, name:string)
{
    console.log("Id = " + id + ", Name = " + name);
}


// TypeInterface

var arr = [0, 1, "test"];
arr.push("str") // OK
arr.push(true); // Compiler Error: Argument of type 'true' is not assignable to parameter of type 'string | number'

function sum(a: number, b: number )
{
    return a + b;
}
var total: number = sum(10,20); // OK
var str: string = sum(10,20); // Compiler Error


// TypeAssertion

let code: any = 123;
let employeeCode = <number> code;
console.log(typeof(employeeCode)); //Output: number



let employeeName = "John";
// or
let employeeName:string = "John";

var num1:number = 1;

const playerCodes = {
    player1 : 9,
    player2 : 10,
    player3 : 13,
    player4 : 20
};
playerCodes.player2 = 11; // OK

playerCodes = {     //Compiler Error: Cannot assign to playerCodes because it is a constant or read-only
    player1 : 50,   // Modified value
    player2 : 10,
    player3 : 13,
    player4 : 20
};

playerCodesArray = {     //Compiler Error: Cannot assign to playerCodes because it is a constant or read-only
    player1 : 50,   // Modified value
    player2 : playerCodes[Test],
    player3 : 13,
    player4 : 20
};

