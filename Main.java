import java.util.Scanner;

public class Main {

	public static int getArrayAddress(int baseAddress, int linearIndex, int elementSize) {
		return baseAddress + (linearIndex * elementSize);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of dimensions: ");
		int Dimensions = scan.nextInt();

		System.out.print("Enter the base address: ");
		int base = scan.nextInt();

		System.out.print("Enter element size: ");
		int elementSize = scan.nextInt();

		int[] dimensions = new int[Dimensions];
		System.out.println("\nEnter the upper bounds for each dimension:");
		for (int i = 0; i < Dimensions; i++) {
			System.out.print("Dimension " + (i + 1) + " upper bound: ");
			dimensions[i] = scan.nextInt();
		}

		int[] targetElements = new int[Dimensions];
		System.out.println("\nEnter the target element:");
		for (int i = 0; i < Dimensions; i++) {
			System.out.print("Index for dimension " + (i + 1) + ": ");
			targetElements[i] = scan.nextInt();
		}

		int linearIndex = getLinearIndex(dimensions, targetElements);
		int address = getArrayAddress(base, linearIndex, elementSize);

		System.out.println("\n----- Address Calculation -----");
		System.out.print("Target Elements: ");
		for (int i = 0; i < Dimensions; i++) {
			System.out.print(targetElements[i] + " ");
		}

		// Removed the line that prints the linear index
		System.out.println("\nCalculated address: " + address);
	}

	public static int getLinearIndex(int[] dimensions, int[] indices) {
		int linearIndex = 0;
		int factor = 1;
		for (int i = dimensions.length - 1; i >= 0; i--) {
			linearIndex += indices[i] * factor;
			factor *= dimensions[i];
		}
		return linearIndex;
	}
}
